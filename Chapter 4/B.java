/*
 * 16/07/2024
 * B
 * In this getTime() method is returning a 
 * string value and void is it's return type so we need to correct that to String
 * otherwise it will throw error
 */
class Clock {
    String time;
    void setTime(String t) {
        time = t;
    }
    String getTime() {
        return time;
    }
}


class ClockTestDrive {
    public static void main(String[] args) {
        Clock c = new Clock();
        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("time: "+tod);
    }
}