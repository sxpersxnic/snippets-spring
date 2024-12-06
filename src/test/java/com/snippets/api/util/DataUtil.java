package com.snippets.api.util;

import com.snippets.api.model.User;
import com.snippets.api.model.Profile;
import com.snippets.api.model.Snippet;
import com.snippets.api.model.Tag;

import java.time.LocalDateTime;
import java.util.*;

public class DataUtil {

    public static UUID getTestUUID(int i) {
        String[] variants = {"a", "b", "8", "9"};

        return UUID.fromString("aaaaaaaa-aaaa-4aaa-" + variants[i] + "aaa-aaaaaaaaaaaa");
    }

    public static User getTestUser(int index) {
        return getTestUsers().get(index);
    }

    public static Profile getTestProfile(int index) {
        return getTestProfiles().get(index);
    }

    public static Snippet getTestSnippet(int index) {
        return getTestSnippets().get(index);
    }

    public static Tag getTestTag(int index) {
        return getTestTags().get(index);
    }

    public static List<User> getTestUsers() {
        List<User> users = new ArrayList<>();

        for (int i = 0; i <= 3; i++) {
            User user = new User();

            user.setId(getTestUUID(i));
            user.setEmail("test" + i + "@localhost.com");
            user.setPassword("P@ssw0rd" + i);

            users.add(user);
        }

        return users;
    }



    public static List<Profile> getTestProfiles() {
        List<Profile> profiles = new ArrayList<>();

        for (int i = 0; i <= 3; i++) {

            Tag tag = new Tag();
            Snippet snippet = new Snippet();
            Profile profile = new Profile();

            profile.setId(UUID.randomUUID());
            profile.setUsername("test_user" + i);
            profile.setPhoto("/pfp/test_pfp.png");
            profile.setUser(getTestUser(i));

            profile.setTags(new HashSet<>());
            profile.setSnippets(new HashSet<>());

            profile.getTags().add(tag);
            profile.getSnippets().add(snippet);

            profile.setCreatedAt(LocalDateTime.now());
            profile.setUpdatedAt(LocalDateTime.now());

            tag.setId(getTestUUID(i));
            tag.setProfile(profile);
            tag.setSnippets(new HashSet<>());
            tag.getSnippets().add(snippet);
            tag.setName("tag" + i);
            tag.setColor("#f0f0f" + i);
            tag.setCreatedAt(LocalDateTime.now());
            tag.setUpdatedAt(LocalDateTime.now());

            snippet.setId(getTestUUID(i));
            snippet.setProfile(profile);
            snippet.setTags(new HashSet<>());
            snippet.getTags().add(tag);
            snippet.setTitle("snippet" + i);
            snippet.setLanguage("java");
            snippet.setContent("public class Snippet {}");
            snippet.setCreatedAt(LocalDateTime.now());
            snippet.setUpdatedAt(LocalDateTime.now());

            profiles.add(profile);
        }

        return profiles;
    }

    public static List<Snippet> getTestSnippets() {
        List<Snippet> snippets = new ArrayList<>();

        for (int i = 0; i <= 3; i++) {
            Snippet snippet = new Snippet();
            Tag tag = new Tag();
            Profile profile = getTestProfile(i);

            snippet.setId(getTestUUID(i));
            snippet.setProfile(profile);
            snippet.setTags(new HashSet<>());
            snippet.getTags().add(tag);
            snippet.setTitle("snippet" + i);
            snippet.setLanguage("java");
            snippet.setContent("public class Snippet {}");
            snippet.setCreatedAt(LocalDateTime.now());
            snippet.setUpdatedAt(LocalDateTime.now());

            tag.setId(getTestUUID(i));
            tag.setProfile(profile);
            tag.setSnippets(new HashSet<>());
            tag.getSnippets().add(snippet);
            tag.setName("tag" + i);
            tag.setColor("#f0f0f" + i);
            tag.setCreatedAt(LocalDateTime.now());
            tag.setUpdatedAt(LocalDateTime.now());

            snippets.add(snippet);
        }
        return snippets;
    }

    public static List<Tag> getTestTags() {
        List<Tag> tags = new ArrayList<>();

        for (int i = 0; i <= 3; i++) {
            Tag tag = new Tag();
            Snippet snippet = getTestSnippet(i);
            Profile profile = getTestProfile(i);

            tag.setId(getTestUUID(i));
            tag.setProfile(profile);
            tag.setSnippets(new HashSet<>());
            tag.getSnippets().add(snippet);
            tag.setName("tag" + i);
            tag.setColor("#f0f0f" + i);
            tag.setCreatedAt(LocalDateTime.now());
            tag.setUpdatedAt(LocalDateTime.now());

            tags.add(tag);
        }

        return tags;
    }
}
