@@ -1,33 +0,0 @@
public class ParallelTasklibrary{

public static void main(){
            int sum = 0;
            var watch = Stopwatch.StartNew();
            watch.Start();
            sum = 0;
            
            for (int i = 0; i < 500000000; i++)
            {
                sum += i;
            }

            watch.Stop();
            label1.Text = watch.ElapsedMilliseconds.ToString();
            label1.Text += "      " + sum;

            watch.Reset();
            watch.Start();
            sum = 0;

            Parallel.For(0, 500000000, j =>
            {
                sum += j;
            });

            watch.Stop();

            label2.Text = watch.ElapsedMilliseconds.ToString();
            label2.Text += "      " + sum;
	}

}
\ No newline at end of file