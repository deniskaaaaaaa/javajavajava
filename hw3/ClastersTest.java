import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

public class ClustersTest {

    @Test
    public void testClusterize() {
        String[] result1 = Clusters.clusterize("Hello (World)");
        Assertions.assertThat(result1).containsExactly("Hello (World)");

        String[] result2 = Clusters.clusterize("This is a (test) input.");
        Assertions.assertThat(result2).containsExactly("This is a (test) input.");

        String[] result3 = Clusters.clusterize("(One) (Two) (Three)");
        Assertions.assertThat(result3).containsExactly("(One)", " (Two)", " (Three)");

        String[] result4 = Clusters.clusterize("(A) (B) (C) (D) (E)");
        Assertions.assertThat(result4).containsExactly("(A)", " (B)", " (C)", " (D)", " (E)");

        String[] result5 = Clusters.clusterize("NoBracketsHere");
        Assertions.assertThat(result5).isEmpty();

        String[] result6 = Clusters.clusterize("");
        Assertions.assertThat(result6).isEmpty();
    }

    @Test
    public void testClusterizeWithNullInput() {
        String[] result = Clusters.clusterize(null);
        Assertions.assertThat(result).isEmpty();
    }
}
