public enum Color {
    GREEN(1){
        @Override
        public void info() {
            System.out.println("GREEN go");
        }
    },
    YELLOW(2){
        @Override
        public void info() {
            System.out.println("YELLOW wait");
        }
    },
    RED(3){
        @Override
        public void info() {
            System.out.println("RED stop");
        }
    };

    private final int number;

    Color(int number) {
        this.number = number;
    }

    public abstract void info ();
}

