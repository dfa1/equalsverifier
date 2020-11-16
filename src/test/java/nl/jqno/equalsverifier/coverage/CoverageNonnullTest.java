package nl.jqno.equalsverifier.coverage;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.testhelpers.annotations.javax.annotation.Nonnull;
import org.junit.jupiter.api.Test;

// CHECKSTYLE OFF: LocalFinalVariableName
// CHECKSTYLE OFF: NeedBraces

public class CoverageNonnullTest {
    @Test
    public void lombokCoverage() {
        EqualsVerifier.forClass(LombokNonnullStringContainer.class)
                .withIgnoredAnnotations(Nonnull.class)
                .verify();

        // Also cover the constructor
        new LombokNonnullStringContainer("");
    }

    /** equals and hashCode generated by Project Lombok 1.16.10, using delombok. */
    /*
     * Original class:
     *
     * @EqualsAndHashCode
     * public static final class LombokNonnullStringContainer {
     *     @Nonnull
     *     private final String s;
     *
     *     public LombokNonnullStringContainer(String s) {
     *         this.s = s;
     *     }
     * }
     */
    public static final class LombokNonnullStringContainer {
        @Nonnull private final String s;

        public LombokNonnullStringContainer(String s) {
            this.s = s;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        public boolean equals(final java.lang.Object o) {
            if (o == this) return true;
            if (!(o instanceof CoverageNonnullTest.LombokNonnullStringContainer)) return false;
            final LombokNonnullStringContainer other = (LombokNonnullStringContainer) o;
            final java.lang.Object this$s = this.s;
            final java.lang.Object other$s = other.s;
            if (this$s == null ? other$s != null : !this$s.equals(other$s)) return false;
            return true;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final java.lang.Object $s = this.s;
            result = result * PRIME + ($s == null ? 43 : $s.hashCode());
            return result;
        }
    }
}
