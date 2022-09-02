public class Client {

    public static void main(String[] args) {
        System.out.println("====================WITH CONCRETE LIGHTWEIGHT A====================");
        ConcreteLightWeightA concreteLightWeightA = new ConcreteLightWeightA(73, 'a', "ProtoType Pattern", 2.0);
        HeavyWeight heavyWeight = new HeavyWeight(concreteLightWeightA);

        System.out.println("--------------------ORIGINAL--------------------");
        System.out.println(heavyWeight);
        System.out.println("--------------------CLONED--------------------");
        HeavyWeight heavyWeightCloned = heavyWeight.clone();
        System.out.println(heavyWeightCloned);
        System.out.println("Changing values in cloned lightWeight object");
        heavyWeightCloned.getLightWeight().setA(74);
        heavyWeightCloned.getLightWeight().setB('z');
        heavyWeightCloned.getLightWeight().setC("Awesome cloning using prototype pattern");
        System.out.println("--------------------ORIGINAL--------------------");
        System.out.println(heavyWeight);
        System.out.println("--------------------CLONED--------------------");
        System.out.println(heavyWeightCloned);


        System.out.println();
        System.out.println();
        System.out.println("====================WITH CONCRETE LIGHTWEIGHT B====================");
        ConcreteLightWeightB concreteLightWeightB = new ConcreteLightWeightB(73, 'a', "ProtoType Pattern", 22.0);
        heavyWeight = new HeavyWeight(concreteLightWeightB);

        System.out.println("--------------------ORIGINAL--------------------");
        System.out.println(heavyWeight);
        System.out.println("--------------------CLONED--------------------");
        heavyWeightCloned = heavyWeight.clone();
        System.out.println(heavyWeightCloned);
        System.out.println("Changing values in cloned lightWeight object");
        heavyWeightCloned.getLightWeight().setA(74);
        heavyWeightCloned.getLightWeight().setB('z');
        heavyWeightCloned.getLightWeight().setC("Awesome cloning using prototype pattern");
        System.out.println("--------------------ORIGINAL--------------------");
        System.out.println(heavyWeight);
        System.out.println("--------------------CLONED--------------------");
        System.out.println(heavyWeightCloned);


    }

}
