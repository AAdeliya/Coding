package org.example;
import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.Picture;

public class SeamCarving {
        public static void main(String[] args) {
          Picture picture  = new Picture(" ");
          int width = picture.width();
          int height = picture.height();

          double[][] energy = computeEnergy(picture);

          for (int i = 0; i< numberOfSeamsToRemove; i++) {
              int[] seam = findVerticalSeam(energy);
              picture = removeVerticalSeam(picture, seam);
              energy = updateEnergyMap(picture);
          }

          picture.show();

        }

        private static double[][] computeEnergy(Picture picture) {

    }

    private static int[] findVerticalSeam(double[][] energy) {

    }

    private static Picture removeVerticalSeam(Picture picture, int[] seam) {}

}
