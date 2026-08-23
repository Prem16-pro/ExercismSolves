
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int[]{0,2,5,3,7,8,4};
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        boolean a = false;
        for(int b : birdsPerDay){
            if(b == 0){
                a = true;
            }
        }
        return a;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int a = 0;
        int days = numberOfDays > 7 ? 7 : numberOfDays;
        for(int i = 0;i<days;i++){
           a += birdsPerDay[i] ;
        }
        return a;
    }

    public int getBusyDays() {
        int a = 0;
        for(int b: birdsPerDay){
            if(b > 4){
                a+=1;
            }
        }
        return a;
    }
}
