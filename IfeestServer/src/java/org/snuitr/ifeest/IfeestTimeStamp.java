/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.snuitr.ifeest;

/**
 *
 * @author sander
 */
public final class IfeestTimeStamp {

    private int feestYear, feestMonth, feestDay, feestHour, feestMinute,
            feestSecond, feestMiliSecond;
    private String feestTimeStamp;

    public IfeestTimeStamp() {
        this.init();
    }

    public IfeestTimeStamp(int myYear, int myMonth, int myDay, int myHour,
            int myMinute, int mySecond, int myMiliSecond) {
        this.setFeestYear(myYear);
        this.setFeestMonth(myMonth);
        this.setFeestDay(myDay);
        this.setFeestHour(myHour);
        this.setFeestMinute(myMinute);
        this.setFeestSecond(mySecond);
        this.setFeestMiliSecond(myMiliSecond);
        this.makeTimeStampString();
    }

    public IfeestTimeStamp(int myYear, int myMonth, int myDay) {
        this();
        this.setFeestYear(myYear);
        this.setFeestMonth(myMonth);
        this.setFeestDay(myDay);
        this.setFeestHour(12);
        this.makeTimeStampString();
    }

    public IfeestTimeStamp(int myYear, int myMonth, int myDay, int myHour,
            int myMinute, int mySecond) {
        this();
        this.setFeestYear(myYear);
        this.setFeestMonth(myMonth);
        this.setFeestDay(myDay);
        this.setFeestHour(myHour);
        this.setFeestMinute(myMinute);
        this.setFeestSecond(mySecond);
        this.makeTimeStampString();
    }

    public IfeestTimeStamp(String myTimeStamp) {
        this();
        this.setFeestTimeStamp(myTimeStamp);
        this.makeTimeStampFields();
    }

    public void init() {
        this.setFeestYear(0);
        this.setFeestMonth(0);
        this.setFeestDay(0);
        this.setFeestHour(0);
        this.setFeestMinute(0);
        this.setFeestSecond(0);
        this.setFeestMiliSecond(0);
        this.makeTimeStampString();
    }
    
    public void edison() {
        this.setFeestYear(1847);
        this.setFeestMonth(2);
        this.setFeestDay(11);
        this.setFeestHour(12);
        this.makeTimeStampString();
    }

    public static String convertToTimeStampString(int myYear, int myMonth, int myDay, int myHour,
            int myMinute, int mySecond, int myMiliSecond) {
        // yyyy-mm-dd hh:mm:ss.mmmmmmmmm
        String r = String.format("%04d-%02d-%02d %02d:%02d:%02d.%09d", myYear, myMonth, myDay, myHour,
                myMinute, mySecond, myMiliSecond);
        return r;
    }

    private void makeTimeStampString() {
        this.setFeestTimeStamp(convertToTimeStampString(this.getFeestYear(), this.getFeestMonth(),
                this.getFeestDay(), this.getFeestHour(), this.getFeestMinute(), this.getFeestSecond(),
                this.getFeestMiliSecond()));
    }

    private void makeTimeStampFields() {
        try {
            this.setFeestYear(Integer.parseInt((this.getFeestTimeStamp()).substring(0, 4)));
            this.setFeestMonth(Integer.parseInt((this.getFeestTimeStamp()).substring(5, 7)));
            this.setFeestDay(Integer.parseInt((this.getFeestTimeStamp()).substring(8, 10)));
            this.setFeestHour(Integer.parseInt((this.getFeestTimeStamp()).substring(11, 13)));
            this.setFeestMinute(Integer.parseInt((this.getFeestTimeStamp()).substring(14, 16)));
            this.setFeestSecond(Integer.parseInt((this.getFeestTimeStamp()).substring(17, 19)));
            this.setFeestSecond(Integer.parseInt((this.getFeestTimeStamp()).substring(20, 29)));
        } catch (java.lang.StringIndexOutOfBoundsException e) {}    
    }

    public String toDebugString() {
        return "[" + getFeestYear() + "][" + getFeestMonth() + "][" + getFeestDay() + "][" + getFeestHour()
                + "][" + getFeestMinute() + "][" + getFeestSecond() + "][" + getFeestMiliSecond()
                + "][" + getFeestTimeStamp() + "]";
    }

    public int getFeestDay() {
        return feestDay;
    }

    public void setFeestDay(int feestDay) {
        this.feestDay = feestDay;
    }

    public int getFeestHour() {
        return feestHour;
    }

    public void setFeestHour(int feestHour) {
        this.feestHour = feestHour;
    }

    public int getFeestMiliSecond() {
        return feestMiliSecond;
    }

    public void setFeestMiliSecond(int feestMiliSecond) {
        this.feestMiliSecond = feestMiliSecond;
    }

    public int getFeestMinute() {
        return feestMinute;
    }

    public void setFeestMinute(int feestMinute) {
        this.feestMinute = feestMinute;
    }

    public int getFeestMonth() {
        return feestMonth;
    }

    public void setFeestMonth(int feestMonth) {
        this.feestMonth = feestMonth;
    }

    public int getFeestSecond() {
        return feestSecond;
    }

    public void setFeestSecond(int feestSecond) {
        this.feestSecond = feestSecond;
    }

    public String getFeestTimeStamp() {
        return feestTimeStamp;
    }

    public void setFeestTimeStamp(String feestTimeStamp) {
        this.feestTimeStamp = feestTimeStamp;
    }

    public int getFeestYear() {
        return feestYear;
    }

    public void setFeestYear(int feestYear) {
        this.feestYear = feestYear;
    }
}
