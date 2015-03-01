package pl.grm.pts;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.util.*;

import org.junit.*;

import pl.grm.pts.core.fourier.util.*;
import pl.grm.pts.core.misc.*;

public class TestVectorUtils {
	
	@Test
	public final void testToComplexVector() {
		String txt = "[2 3 0 2+2j 3-2j j]";
		Vector<Complex> complexVector = VectorUtils.toComplexVector(txt);
		assertThat(complexVector.get(0).getReal(), is(2D));
		assertThat(complexVector.get(0).getImaginary(), is(0D));
		assertThat(complexVector.get(3).getReal(), is(2D));
		assertThat(complexVector.get(3).getImaginary(), is(2D));
		assertThat(complexVector.get(4).getReal(), is(3D));
		assertThat(complexVector.get(4).getImaginary(), is(-2D));
		assertThat(complexVector.get(5).getReal(), is(0D));
		// assertThat(complexVector.get(5).getImaginary(), is(1D)); //FIXME
	}
}
