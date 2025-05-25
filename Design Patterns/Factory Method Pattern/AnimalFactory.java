public class AnimalFactory {

    public Animal createAnimal(String type) {
//        if (type.equalsIgnoreCase("cat")) {
//            return new Cat();
//        } else if (type.equalsIgnoreCase("dog")) {
//            return new Dog();
//        } else if (type.equalsIgnoreCase("duck")) {
//            return new Duck();
//        } else
//            return null;
        switch (type) {
            case "cat":
                return new Cat();
            case "dog":
                return new Dog();
            case "duck":
                return new Duck();
            default:
                return null;
        }
    }
}
