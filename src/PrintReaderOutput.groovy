
class PrintReaderOutput {

	public PrintReaderOutput() {
		// TODO Auto-generated constructor stub
	}
	
	def print(Reader reader) {
		int rch = 0;
		char[] buffer = new char[8]
		println "Hex-Code                 - Char     - Read chars"
		while((rch=reader.read(buffer,0,8))!=-1) {
			StringBuilder sbx = new StringBuilder()
			StringBuilder sb = new StringBuilder()
			for (int i=0; i<rch; i++) {
				sbx << sprintf("%02x ", (int)buffer[i])
				sb << sprintf("%s", buffer[i])
			}
			for (int i=rch; i<8; i++) {
				sbx << sprintf("   ", (int)buffer[i])
				sb << sprintf(" ", buffer[i])
			}
			printf("%s - %s - %d\n",sbx, sb, rch)
		}
	}

}
