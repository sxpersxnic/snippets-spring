package com.snippets.api.util;

import com.snippets.api.dto.request.*;
import com.snippets.api.dto.response.*;
import com.snippets.api.model.Profile;
import com.snippets.api.model.Snippet;
import com.snippets.api.model.Tag;
import com.snippets.api.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataDTOUtil {

    public UserRequestDTO getTestUserRequestDTO(int index) {
        return getTestUserRequestDTOs().get(index);
    }

    public UserResponseDTO getTestUserResponseDTO(int index) {
        return getTestUserResponseDTOs().get(index);
    }

    public ProfileRequestDTO getTestProfileRequestDTO(int index) {
        return getTestProfileRequestDTOs().get(index);
    }

    public ProfileResponseDTO getTestProfileResponseDTO(int index) {
        return getTestProfileResponseDTOs().get(index);
    }

    public TagRequestDTO getTestTagRequestDTO(int index) {
        return getTestTagRequestDTOs().get(index);
    }

    public TagResponseDTO getTestTagResponseDTO(int index) {
        return getTestTagResponseDTOs().get(index);
    }

    public SnippetRequestDTO getTestSnippetRequestDTO(int index) {
        return getTestSnippetRequestDTOs().get(index);
    }

    public SnippetResponseDTO getTestSnippetResponseDTO(int index) {
        return getTestSnippetResponseDTOs().get(index);
    }

    public SignUpRequestDTO getTestSignUpRequestDTO(int index) {
        return getTestSignUpRequestDTOs().get(index);
    }

    public SignUpResponseDTO getTestSignUpResponseDTO(int index) {
        return getTestSignUpResponseDTOs().get(index);
    }

    public SignInRequestDTO getTestSignInRequestDTO(int index) {
        return getTestSignInRequestDTOs().get(index);
    }

    public SignInResponseDTO getTestSignInResponseDTO(int index) {
        return getTestSignInResponseDTOs().get(index);
    }

    public List<UserRequestDTO> getTestUserRequestDTOs() {
        List<UserRequestDTO> dtos = new ArrayList<>();

        for (int i = 0; i <= 3; i++) {
            User src = DataUtil.getTestUser(i);
            UserRequestDTO dto = new UserRequestDTO();

            dto.setEmail(src.getEmail());
            dto.setPassword(src.getPassword());

            dtos.add(dto);
        }

        return dtos;
    }

    public List<UserResponseDTO> getTestUserResponseDTOs() {
        List<UserResponseDTO> dtos = new ArrayList<>();

        for (int i = 0; i <= 3; i++) {
            User src = DataUtil.getTestUser(i);
            UserResponseDTO dto = new UserResponseDTO();

            dto.setId(src.getId());
            dto.setEmail(src.getEmail());

            dtos.add(dto);
        }

        return dtos;
    }

    public List<ProfileRequestDTO> getTestProfileRequestDTOs() {
        List<ProfileRequestDTO> dtos = new ArrayList<>();

        for (int i = 0; i <= 3; i++) {
            Profile src = DataUtil.getTestProfile(i);
            ProfileRequestDTO dto = new ProfileRequestDTO();

            dto.setUsername(src.getUsername());
            dto.setPhoto(src.getPhoto());

            dtos.add(dto);
        }

        return dtos;
    }

    public List<ProfileResponseDTO> getTestProfileResponseDTOs() {
        List<ProfileResponseDTO> dtos = new ArrayList<>();

        for (int i = 0; i <= 3; i++) {
            Profile src = DataUtil.getTestProfile(i);
            ProfileResponseDTO dto = new ProfileResponseDTO();

            dto.setId(src.getId());
            dto.setUserId(src.getUser().getId());
            dto.setSnippetIds(src.getSnippets().stream().map(Snippet::getId).toList());
            dto.setTagIds(src.getTags().stream().map(Tag::getId).toList());
            dto.setUsername(src.getUsername());
            dto.setPhoto(src.getPhoto());
            dto.setCreatedAt(src.getCreatedAt());
            dto.setUpdatedAt(src.getUpdatedAt());

            dtos.add(dto);
        }

        return dtos;
    }

    public List<TagRequestDTO> getTestTagRequestDTOs() {
        List<TagRequestDTO> dtos = new ArrayList<>();

        for (int i = 0; i <= 3; i++) {
            Tag src = DataUtil.getTestTag(i);
            TagRequestDTO dto = new TagRequestDTO();

            dto.setName(src.getName());
            dto.setColor(src.getColor());

            dtos.add(dto);
        }

        return dtos;
    }

    public List<TagResponseDTO> getTestTagResponseDTOs() {
        List<TagResponseDTO> dtos = new ArrayList<>();

        for (int i = 0; i <= 3; i++) {
            Tag src = DataUtil.getTestTag(i);
            TagResponseDTO dto = new TagResponseDTO();

            dto.setId(src.getId());
            dto.setSnippetIds(src.getSnippets().stream().map(Snippet::getId).toList());
            dto.setAuthorId(src.getProfile().getId());
            dto.setName(src.getName());
            dto.setColor(src.getColor());
            dto.setCreatedAt(src.getCreatedAt());
            dto.setUpdatedAt(src.getUpdatedAt());

            dtos.add(dto);
        }

        return dtos;
    }

    public List<SnippetRequestDTO> getTestSnippetRequestDTOs() {
        List<SnippetRequestDTO> dtos = new ArrayList<>();

        for (int i = 0; i <= 3; i++) {
            Snippet src = DataUtil.getTestSnippet(i);
            SnippetRequestDTO dto = new SnippetRequestDTO();

            dto.setTitle(src.getTitle());
            dto.setContent(src.getContent());
            dto.setLanguage(src.getLanguage());

            dtos.add(dto);
        }

        return dtos;
    }

    public List<SnippetResponseDTO> getTestSnippetResponseDTOs() {
        List<SnippetResponseDTO> dtos = new ArrayList<>();

        for (int i = 0; i <= 3; i++) {
            Snippet src = DataUtil.getTestSnippet(i);
            SnippetResponseDTO dto = new SnippetResponseDTO();

            dto.setId(src.getId());
            dto.setAuthorId(src.getProfile().getId());
            dto.setTagIds(src.getTags().stream().map(Tag::getId).toList());
            dto.setTitle(src.getTitle());
            dto.setContent(src.getContent());
            dto.setLanguage(src.getLanguage());
            dto.setCreatedAt(src.getCreatedAt());
            dto.setUpdatedAt(src.getUpdatedAt());

            dtos.add(dto);
        }

        return dtos;
    }

    public List<SignUpRequestDTO> getTestSignUpRequestDTOs() {
        List<SignUpRequestDTO> dtos = new ArrayList<>();

        for (int i = 0; i <= 3; i++) {
            User src = DataUtil.getTestUser(i);
            Profile src2 = DataUtil.getTestProfile(i);

            SignUpRequestDTO dto = new SignUpRequestDTO();

            dto.setUsername(src2.getUsername());
            dto.setEmail(src.getEmail());
            dto.setPassword(src.getPassword());

            dtos.add(dto);
        }

        return dtos;
    }

    public List<SignUpResponseDTO> getTestSignUpResponseDTOs() {
        List<SignUpResponseDTO> dtos = new ArrayList<>();

        for (int i = 0; i <= 3; i++) {
            User src = DataUtil.getTestUser(i);
            Profile src2 = DataUtil.getTestProfile(i);
            SignUpResponseDTO dto = new SignUpResponseDTO();

            dto.setId(src.getId());
            dto.setUsername(src2.getUsername());
            dto.setEmail(src.getEmail());

            dtos.add(dto);
        }

        return dtos;
    }

    public List<SignInRequestDTO> getTestSignInRequestDTOs() {
        List<SignInRequestDTO> dtos = new ArrayList<>();

        for (int i = 0; i <= 3; i++) {
            User src = DataUtil.getTestUser(i);
            SignInRequestDTO dto = new SignInRequestDTO();

            dto.setEmail(src.getEmail());
            dto.setPassword(src.getPassword());

            dtos.add(dto);
        }

        return dtos;
    }

    public List<SignInResponseDTO> getTestSignInResponseDTOs() {
        List<SignInResponseDTO> dtos = new ArrayList<>();

        for (int i = 0; i <= 3; i++) {
            User src = DataUtil.getTestUser(i);
            Profile src2 = DataUtil.getTestProfile(i);
            String token = "InvalidToken";

            SignInResponseDTO dto = new SignInResponseDTO();

            dto.setId(src.getId());
            dto.setEmail(src.getEmail());
            dto.setUsername(src2.getUsername());
            dto.setToken(token);
        }

        return dtos;
    }
}
