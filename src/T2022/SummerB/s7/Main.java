package T2022.SummerB.s7;

public class Main {

//    public static void outStanding (SportUnion[] unions){
//        for (int i = 0; i < unions.length; i++)
//            if (unions[i].getUnionData().length >= 5) {
//
//                SportClub[] unionData = unions[i].getUnionData();
//
//                for (int j = 0; j < unionData.length; j++)
//                    if (unionData[j].getCountOfPlayer() >= 50) {
//                        System.out.println(unions[i].getUnionName());
//                        break;
//                    }
//            }
//
//    }

    public static void printOutstandingUnions(SportUnion[] unions) {
        for (int i = 0; i < unions.length; i++) {
            SportUnion union = unions[i];
            SportClub[] unionData = union.getUnionData();

            if (union.getNumberUnion() >= 5) {
                boolean isOutstanding = true;

                for (int j = 0; j < union.getNumberUnion(); j++) {
                    if (unionData[j].getCountOfPlayer() < 50) {
                        isOutstanding = false;
                        break;
                    }
                }

                if (isOutstanding) {
                    System.out.println(union.getUnionName());
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create an array of SportUnion objects
        SportUnion[] unions = new SportUnion[2];

        // Create SportClub objects
        SportClub[] union1Data = new SportClub[3];
        union1Data[0] = new SportClub(1, "Football", "City1", 60, 2);
        union1Data[1] = new SportClub(2, "Basketball", "City1", 40, 1);
        union1Data[2] = new SportClub(3, "Tennis", "City1", 30, 1);

        SportClub[] union2Data = new SportClub[2];
        union2Data[0] = new SportClub(4, "Cricket", "City2", 80, 3);
        union2Data[1] = new SportClub(5, "Hockey", "City2", 20, 1);

        // Create SportUnion objects
        unions[0] = new SportUnion("Union1", union1Data, 3);
        unions[1] = new SportUnion("Union2", union2Data, 2);

        // Call the printOutstandingUnions method to print outstanding unions
        printOutstandingUnions(unions);
    }
}
