package OptimalityCalculator;

import java.io.Serializable;

    public final class Rating implements Serializable, Comparable<Rating> {
        public static final long serialVersionUID = 362898405551261187L;
        public static final int MIN_VALUE = 0;
        public static final int MAX_VALUE = 100;
        private int rating;

        public Rating(int rating) {
            if (rating >= 0 && rating <= 100) {
                this.rating = rating;
            } else {
                throw new IllegalArgumentException(String.format("rating must be no smaller than %d and no greater than %d (received %d)", 0, 100, rating));
            }
        }

        private Rating() {
            this(0);
        }

        public int getRating() {
            return this.rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            } else if (o != null && this.getClass() == o.getClass()) {
                Rating rating1 = (Rating)o;
                return this.rating == rating1.rating;
            } else {
                return false;
            }
        }

        public int hashCode() {
            return this.rating;
        }

        public int compareTo(Rating o) {
            return Integer.valueOf(this.rating).compareTo(o.rating);
        }
    }

