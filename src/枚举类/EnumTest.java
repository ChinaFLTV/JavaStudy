package 枚举类;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
**@Author LiGuanda
**@Data 2022/3/12 下午 3:31
**@Description This is a description of EnumTest
**@Params
**@Return
**@Since versio-1.0  */
public class EnumTest {



    public static void main(String[] args) {


        System.out.println((SpaceAgencyEnum.valueOf("NASA")) instanceof Enum);
        System.out.println(SpaceAgencyEnum.values());
        System.out.println(SpaceAgencyEnum.valueOf("NASA").getDeclaringClass());
        System.out.println(SpaceAgencyEnum.valueOf("CNSA").name());
        System.out.println(SpaceAgencyEnum.valueOf("ESA").toString());
        System.out.println(SpaceAgencyEnum.valueOf("RKA").ordinal());
        System.out.println(SpaceAgencyEnum.class.getEnumConstants());

        Class<?> clasz = SpaceAgencyEnum.CNSA.getDeclaringClass();
        System.out.println("--------------exquisite segment line---------------");

        //SpaceAgencyEnum.CNSA.haha();
        //SpaceAgencyEnum.CNSA.haha();
        SpaceAgencyEnum.CNSA.hehe();
        System.out.println(SpaceAgencyEnum.CNSA.heihei());

        System.out.println(clasz.getEnumConstants());


        SpaceAgencyEnum sae1 = SpaceAgencyEnum.CNSA;

        for(SpaceAgencyEnum sae : SpaceAgencyEnum.values()){

            System.out.println(sae.toString());

        }


        System.out.println(SpaceAgencyEnum.CNSA.compareTo(SpaceAgencyEnum.NASA));
        System.out.println(SpaceAgencyEnum.NASA.compareTo(SpaceAgencyEnum.RKA));
        //System.out.println(SpaceAgencyEnum.CNSA.compareTo(Celebrity.c1));

        switch(sae1){

            case CNSA:
                System.out.println("Cnsa");
                break;
            case NASA:
                break;
            case ESA:
                break;
            case RKA:
                break;

        }


    }
}

class Season {

    private final String SEASONNAME;
    private final String SEASONDESC;

    private Season(String seasonname, String seasondesc) {

        this.SEASONNAME = seasonname;
        this.SEASONDESC = seasondesc;

    }


/*    enum RetentionPolicy{

        SOURCE,
        CLASS,
        RUNTIME;

    }*/

    //@Retention(RetentionPolicy.SOURCE)
    @interface SAE{  }
    public static final Season SPRING = new Season("springtime", "spring blossoms");
    public static final Season SUMMER = new Season("Summer", "scorching summer");
    public static final Season AUTUMN = new Season("fall", "an invigorating autumn climate");
    public static final Season WINTER = new Season("winter", "snow gleams white");


}

class Celebrity {

    private final String celebrityName;
    private final int celebrityAge;


    private Celebrity(String celebrityName, int celebrityAge) {

        this.celebrityName = celebrityName;
        this.celebrityAge = celebrityAge;

    }


    public static final Celebrity c1 = new Celebrity("IU", 29);
    public static final Celebrity c2 = new Celebrity("JuJingyi", 27);
    public static final Celebrity c3 = new Celebrity("Talyor Swift", 33);
    public static final Celebrity c4 = new Celebrity("DengZiqi", 31);

}

interface SAE{


    public abstract String  heihei();
    public abstract void hehe();


}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test1{


}

enum SpaceAgencyEnum implements SAE{

    CNSA("CNSA", "China"){
        @Override
        public String  heihei(){

            return "heihei";

        }
        /**
        **@Author LiGuanda
        **@Data 2022/3/12 下午 3:32
        **@Description This is a description of SpaceAgencyEnum
        **@Params []
        **@Return void
        **@Since versio-1.0  */

        @Override
        public void hehe(){

            System.out.println("hhhhhhhhhhhhhhhhhhhhhhhh");

        }



        public void haha(){

            System.out.println("aaaaaaaaaaaaaaaaaaaaaa");

        }

        @Deprecated
        public void print(){

            ;

        }
        @SuppressWarnings("heihei")
        int a = 10;


    },
    NASA("NASA", "USA"){

        public String  heihei(){


            return "";
        }

        @Override
        public void hehe(){

            System.out.println("hhhhhhhhhhhhhhhhhhhhhhhh");

        }

        public void haha(){

            //System.out.println("aaaaaaaaaaaaaaaaaaaaaa");

        }

    },
    ESA("ESA", "EU"){

        public String  heihei(){


            return "";

        }


        @Override
        public void hehe(){

            System.out.println("hhhhhhhhhhhhhhhhhhhhhhhh");

        }

        public void haha(){

            //System.out.println("aaaaaaaaaaaaaaaaaaaaaa");

        }

    },
    RKA("RKA", "Russia"){

        public String  heihei(){


            return "";

        }

        @Override
        public void hehe(){

            System.out.println("hhhhhhhhhhhhhhhhhhhhhhhh");

        }

        public void haha(){

            //System.out.println("aaaaaaaaaaaaaaaaaaaaaa");

        }

    };

    private final String spaceAgency;
    private final String homeCountry;

    private SpaceAgencyEnum(String spaceAgency, String homeCountry) {

        this.spaceAgency = spaceAgency;
        this.homeCountry = homeCountry;

    }

    public String getSpaceAgency() {

        return this.spaceAgency;

    }

    public String getHomeCountry() {

        return this.homeCountry;

    }

/*    @Override
    public String toString(){



    }*/


}

enum Rocket {

    CZ_8("CZ_8", "China"),
    HEAVYFONCY("Heavy Facon", "USA"),
    DELTA("Delta", "USA"),
    H_IIB("H_IIB", "Japan"),
    SOYUZ("Soyuz", "Russia"),
    PROTON("Proton", "Russia");


    private final String rocketName;
    private final String homeCountry;

    private Rocket(String rocketName, String homeCountry) {

        this.rocketName = rocketName;
        this.homeCountry = homeCountry;

    }

    public String getRocketName() {

        return this.rocketName;

    }

    public String getHomeCountry() {

        return this.homeCountry;

    }


}



