

import java.io.IOException
import java.io.InputStream;

class FakeReader extends Reader {

	String result = '{"results":[{"columns":["n"],"data":[{"row":[{"name":"Alin Coen Band","type":"group"}]}]}],"errors":[]}'
	int index = 0;
	def stopIndex = [69,84,500]
	int nextStop=0;
	
	
	@Override
	public int read(char[] cbuf, int off, int len) throws IOException {
		if (index>=result.size()) {
			return -1
		}
		int num=0
		while(num<len && index < stopIndex[nextStop] && index<result.size()) {
			cbuf[off+num]=result[index]
			num++
			index++
		}
		if(index==stopIndex[nextStop]) {
			nextStop++
		}
		return num;
	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub

	}
}
