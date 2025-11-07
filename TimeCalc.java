public class TimeCalc {
    public static void main(String[] args) {
       
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes= Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minuteToAdd = Integer.parseInt(args[1]);

        int totalMinutes = (hours * 60) + minutes + minuteToAdd;
        int totalHours = totalMinutes / 60;
        int newHours = totalHours % 24;
        int newMinutes = totalMinutes - (totalHours * 60);

        String time = String.format("%02d:%02d", newHours, newMinutes);

        System.out.println(time);

    }
}
