package intrface;
public interface Browsers {
void name();
void owner();
void Download();
void update();
void install();
}
class fireFox implements Browsers{
	public void name() {System.out.println("This Is FireFox Browser.");}
	public void owner() {System.out.println("The Mozilla Corporation is owner.");}
	public void Download() {System.out.println("Download latest version from Internet");}
	public void update() {System.out.println("Update using latest version");}
	public void install() {System.out.println("Installation done using EXE file");}
}
class GoogleCrome implements Browsers{
	public void name() {System.out.println("This is GoogleCrome Browser.");}
	public void owner() {System.out.println("Google is Owner.");}
	public void Download() {System.out.println("Download latest version from Internet");}
	public void update() {System.out.println("Update using latest version");}
	public void install() {System.out.println("Installation done using EXE file");}
}
class InternetExplorar implements Browsers{
	public void name() {System.out.println("his is InternetExplorar Browser.");}
	public void owner() {System.out.println("Microsoft Corporation is owner.");}
	public void Download() {System.out.println("Download latest version from Internet");}
	public void update() {System.out.println("Update using latest version");}
	public void install() {System.out.println("Installation done using EXE file");}
}
class opera implements Browsers{
	public void name() {System.out.println("This is Opera Browser.");}
	public void owner() {System.out.println("Acquisition by Chinese consortium is owner.");}
	public void Download() {System.out.println("Download latest version from Internet");}
	public void update() {System.out.println("Update using latest version");}
	public void install() {System.out.println("Installation done using EXE file");}
}