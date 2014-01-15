package decorator.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

	protected LowerCaseInputStream(InputStream in) {
		super(in);
	}

	/* (non-Javadoc)
	 * @see java.io.FilterInputStream#read()
	 */
	@Override
	public int read() throws IOException {
		int c = super.read();
		return (c == -1 ? c : Character.toLowerCase(c));
	}

	/* (non-Javadoc)
	 * @see java.io.FilterInputStream#read(byte[], int, int)
	 */
	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		int result = super.read(b, off, len);
		for (int i = off; i < off+result; i++) {
			b[i] =  (byte)Character.toLowerCase((char)b[i]);
		}
		return result;
	}
	
}