package org.example;

public class Player {

    enum SubscriptionType {
        GOLD,
        SILVER,
        FREE,
        BANNED
    }

    public class Player {
        private String name;
        private String email;
        private int points;
        private SubscriptionType subscriptionType;

        public Player(String name, String email, int points, SubscriptionType subscriptionType) {
            setName(name);
            setEmail(email);
            setPoints(points);
            setSubscriptionType(subscriptionType);
        }

        public int applyRewars(int reward){
            switch (this) {
                case GOLD:
                    reward = points * 3;
                    break;
                case SILVER:
                    reward = points * 2;
                    break;
                case FREE:
                    reward = points * 1;
                    break;
                case BANNED:
                    reward = 0;
            }
            return rewars;
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public int getPoints() {
            return points;
        }

        public void setPoints(int points) {
            this.points = points;
        }

        public SubscriptionType getSubscriptionType() {
            return subscriptionType;
        }

        public void setSubscriptionType(SubscriptionType subscriptionType) {
            this.subscriptionType = subscriptionType;
        }

    }
}
