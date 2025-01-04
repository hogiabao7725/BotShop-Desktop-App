package OtherFunction;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ChatLoginSystem {
    private static Set<ChatUser> activeUsers = new HashSet<>();

    public static boolean isUserActive(ChatUser user) {
        for (ChatUser activeUser : activeUsers) {
            if (activeUser.getEmail().equals(user.getEmail()) && activeUser.getRole().equals(user.getRole())) {
                //System.out.println("User is already logged in.");
                return true;
            }
        }
        return false;
    }

    public static void addActiveUser(ChatUser user) {
        activeUsers.add(user);
        //System.out.println("Login successful.");
    }

    public static void removeActiveUser(ChatUser user) {
        activeUsers.remove(user);
        //System.out.println("Logout successful.");
    }

    public static class ChatUser {
        private String role;
        private String email;

        public ChatUser(String role, String email) {
            this.role = role;
            this.email = email;
        }

        public String getRole() {
            return role;
        }

        public String getEmail() {
            return email;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 37 * hash + Objects.hashCode(this.role);
            hash = 37 * hash + Objects.hashCode(this.email);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final ChatUser other = (ChatUser) obj;
            if (!Objects.equals(this.role, other.role)) {
                return false;
            }
            return Objects.equals(this.email, other.email);
        }
    }
}

