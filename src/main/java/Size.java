public enum Size {
        SMALL(10),
        MIDDLE(50),
        LARGE(100);

        private int value;

        private Size(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
}
