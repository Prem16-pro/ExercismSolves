public class FootballMatchReports {    
    public static String onField(int shirtNum) {
        String a ;
        switch(shirtNum){
            case 1: a = "goalie";
                    break;
            case 2: a = "left back";
                    break;
            case 3: a = "center back";
                    break;
            case 4: a = "center back";
                    break;
            case 5: a = "right back";
                    break;
            case 6: a = "midfielder";
                    break;
            case 7: a = "midfielder";
                    break;
            case 8: a = "midfielder";
                    break;
            case 9: a = "left wing";
                    break;
            case 10: a = "striker";
                    break;
            case 11: a = "right wing";
                    break;
            default: a = "invalid";
                    break;
        }
        return a;
    }
}
