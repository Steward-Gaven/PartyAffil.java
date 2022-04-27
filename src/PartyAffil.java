class Main {

    public static void main(String[] args) {

        String UserAnswer = "o";

        System.out.println("What is your political stance? Please answer as Democratic (D), Republican (R), Independent (I) or Other (O)");

        if (UserAnswer.equalsIgnoreCase("D"))
        {
            System.out.println("You are a Democrat Donkey");
        }
        else if (UserAnswer.equalsIgnoreCase("R"))
        {
            System.out.println("You are a Republican Elephant");
        }
        else if (UserAnswer.equalsIgnoreCase("I"))
        {
            System.out.println("You are a Independent Person");
        }
        else if (UserAnswer.equalsIgnoreCase("O"))
        {
            System.out.println("You are another political party");
        }
    }
}