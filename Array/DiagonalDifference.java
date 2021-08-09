package Array;

public class DiagonalDifference {

        public static int diagonalDifference(int arr[][], int n)
        {
            int d1 = 0, d2 = 0;

            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    if (i == j)
                        d1 += arr[i][j];

                    if (i == n-1-j)
                        d2 += arr[i][j];
                }
            }

            // Absolute difference of the sums
            // across the diagonals
            return Math.abs(d1 - d2);
        }

        /* Driver program to test above function */
        public static void main(String[] args)
        {
            int n = 3;

            int arr[][] =
                    {
                            {11, 2, 4},
                            {4 , 5, 6},
                            {10, 8, -12}
                    };

            System.out.print(diagonalDifference(arr, n));

        }
    }
