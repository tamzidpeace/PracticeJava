package Artificial_Intelligence;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static class Point {
        private int x;
        private int y;
        private String cell;

        private static List<Integer> marker = new ArrayList<Integer>();

        public Point(int x, int y, String cell) {
            this.x = x;
            this.y = y;
            this.cell = cell;
        }

        public int getX() {
            return x;
        }

        public void setX(int x){
            this.x = x;
            return;
        }

        public void setY(int y){
            this.y = y;
            return;
        }

        public static void addToMarker(int markerID){
            marker.add(markerID);
        }

        public static void clearMarker(){
            marker.clear();
        }

        public static List<Integer> getMarker(){
            return marker;
        }

        public int getY() {
            return y;
        }

        public String getCell() {
            return cell;
        }
    }

    public static double distance(Point p1, Point p2) {
        int a = p1.getX();
        int b = p1.getY();
        int c = p2.getX();
        int d = p2.getY();

        return Math.sqrt(Math.pow((c - a), 2) + Math.pow((d - b), 2));
    }

    public static void pathToPrincess(Point p1, Point p2, int m) {
        Point currentPoint = p1;

        double currentDistance = distance(p1, p2);
        while (distance(p1, p2) != 0) {
            if (currentPoint.getY() != 0 && !currentPoint.getMarker().contains(0)) { // Check up direction
                currentPoint.setY(currentPoint.getY() - 1);
                if (distance(currentPoint, p2) < currentDistance) {
                    System.out.println("UP");
                    currentDistance = distance(currentPoint, p2);
                    currentPoint.clearMarker();
                    continue;
                } else  {
                    currentPoint.setY(currentPoint.getY() + 1); // Revert
                    currentPoint.addToMarker(0);
                    currentDistance = distance(currentPoint, p2);
                }
            } else if (!currentPoint.getMarker().contains(1)) { // Check down direction
                currentPoint.setY(currentPoint.getY() + 1);
                if (distance(currentPoint, p2) < currentDistance) {
                    System.out.println("DOWN");
                    currentDistance = distance(currentPoint, p2);
                    currentPoint.clearMarker();
                    continue;
                } else  {
                    currentPoint.setY(currentPoint.getY() - 1); // Revert
                    currentDistance = distance(currentPoint, p2);
                    currentPoint.addToMarker(1);
                }

            } else if (currentPoint.getX() != 0 && !currentPoint.getMarker().contains(2)) { // Check left direction
                currentPoint.setX(currentPoint.getX() - 1);
                if (distance(currentPoint, p2) < currentDistance) {
                    System.out.println("LEFT");
                    currentDistance = distance(currentPoint, p2);
                    currentPoint.clearMarker();
                    continue;
                } else  {
                    currentPoint.setX(currentPoint.getX() + 1); // Revert
                    currentDistance = distance(currentPoint, p2);
                    currentPoint.addToMarker(2);
                }
            }
            else if ( !currentPoint.getMarker().contains(3)) { // Check right direction
                currentPoint.setX(currentPoint.getX() + 1);
                if (distance(currentPoint, p2) < currentDistance) {
                    System.out.println("RIGHT");
                    currentDistance = distance(currentPoint, p2);
                    currentPoint.clearMarker();
                    continue;
                }
                else {
                    currentPoint.setX(currentPoint.getX() - 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m;
        m = in.nextInt();
        List<Point> points = new ArrayList<Point>();
        Point botPositon = null;
        Point princessPosition= null;
        int pointX = 0;
        int pointY = 0;
        for(int i = 0; i < m; i++) {
            String line = in.next();
            for(int i2 = 0; i2 < m; i2++) {
                points.add(new Point(i2, i, Character.toString(line.charAt(i2))));
            }
        }
        for (Point p : points){
            if (p.getCell().equals("m")){
                botPositon = p;
            }
            else if (p.getCell().equals("p")){
                princessPosition = p;
            }
        }
        pathToPrincess(botPositon, princessPosition, m);
    }
}
