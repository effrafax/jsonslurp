

import java.io.IOException
import java.io.InputStream;

class ProperFakeReader extends Reader {

	String result = '{"results":[{"columns":["n"],"data":[{"row":[{"name":"Alin Coen Band","type":"group"}]}]}],"errors":[]}'
	int index = 0;
	
	
	@Override
	public int read(char[] cbuf, int off, int len) throws IOException {
		if (index>=result.size()) {
			return -1
		}
		int num=0
		while(num<len && index<result.size()) {
			cbuf[off+num]=result[index]
			num++
			index++
		}
		return num;
	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub

	}
}
