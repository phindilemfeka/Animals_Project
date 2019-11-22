import java.util.Arrays;

class Home {

    private Animal[] object = new Animal[0];
    private int z=0;

    void adoptPet(Animal abc){
        object= Arrays.copyOf(object,object.length+1);
        object[object.length-1]=abc;

        if (z<object.length){
            object[z]=abc;

            String xyz ="";
             if (abc.getClass()==Dog.class){
                 xyz="dog";
             }else {
                 xyz = "cat";
             }
                 System.out.println("The adopted animal is " + xyz);
                 z++;


        }



    }
    void makeAllSounds(){
        for (Animal xyz:object){
            xyz.sounds();
        }
    }


    }

