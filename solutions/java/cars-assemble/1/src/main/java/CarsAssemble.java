public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double ans ;
        if(speed == 10){
            ans = speed * 221 * 0.77;
        }else if(speed == 9){
            ans = speed * 221 * 0.8;
        }else if(speed > 4){
            ans = speed * 221 * 0.9;
        }else{
            ans = speed * 221;
        }
        return ans;
    }

    public int workingItemsPerMinute(int speed) {
        double ans ;
        if(speed == 10){
            ans = (speed * 221 * 0.77)/60;
        }else if(speed == 9){
            ans = (speed * 221 * 0.8)/60; 
        }else if(speed > 4){
            ans = (speed * 221 * 0.9)/60;
        }else{
            ans = (speed * 221)/60;
        }
        return (int) ans;
    }
}
