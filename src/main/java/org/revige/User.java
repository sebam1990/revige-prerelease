// Package

    package org.revige;

// Class

    public class User {

        private int id;
        private String username;
        private int role;

        public User(){};

        public User(int id, String username, int role) {
            this.id = id;
            this.username = username;
            this.role = role;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public int getRole() {
            return role;
        }

        public void setRole(int role) {
            this.role = role;
        }

    }