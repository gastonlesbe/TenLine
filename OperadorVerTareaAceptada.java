package com.tenline;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class OperadorVerTareaAceptada {
   
   // System.setProperty("webdriver.chrome.driver", "/home/gaston/WebDrivers/chromedriver");
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     
       
       
        AceptarNuevaTarea();
        editarNuevaTarea();
        completarNuevaTarea();
        
        
        
		System.setProperty("webdriver.chrome.driver", "/home/gaston/WebDrivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
        //go to login page
	    driver.get("https://tenline-frontend-qa.herokuapp.com/auth");
        //check if the login page loads
        boolean iniciarSesion = driver.findElement(By.xpath("//div[contains(text(),'Iniciar Sesión')]")).isDisplayed();
        if(iniciarSesion){
            System.out.println("Login page: PASS");
        }else{
            System.out.println("Login page: ERROR");
        }

        login();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //nuevoTramite();
        driver.findElement(By.xpath("//span[contains(text(),'Mis Tareas')]")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        verNuevaTarea();
    
        //go to Mis Tareas
        //driver.findElement(By.xpath("//span[contains(text(),'Mis Tareas')]")).click();

        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //check page MisTareas
        /*
        boolean misTareas = driver.findElement(By.xpath("//p[contains(text(),'Mis Tareas')]")).isDisplayed();
        if(misTareas){
            System.out.println("Mis Tareas page: PASS");
        }else{
            System.out.println("Mis Tareas page: ERROR");
        }
        */
        //go to Tareas Aceptadas
       //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       //driver.findElement(By.xpath("//button[@title='Editar Tarea']")).click();;
       //driver.findElement(By.cssSelector("button.MuiButtonBase-root.MuiTab-root.MuiTab-textColorInherit.jss4 > span.MuiTab-wrapper")).click();
        //driver.findElement(By.xpath("//div[4]/div[1]/table/tbody/tr[1]/td[8]/div/div[1]//*[name()='svg']")).click();

        
        
}

    private static void completarNuevaTarea() {
    }

    private static void editarNuevaTarea() {
    }

    private static void AceptarNuevaTarea() {
    }

    private static void verNuevaTarea() {
        driver.findElement(By.xpath("//button[@title ='Ver Tarea']")).click();
    }

    private static void nuevoTramite() {
        driver.findElement(By.xpath("//span[contains(text(),'Nuevo Trámite')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Tramite de Carnet de Conducir')]")).click();
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//input[@id='RUT :']")).sendKeys("20502945");
        driver.findElement(By.xpath("//input[@id='Nombre :']")).sendKeys("Jose Suarez");
        driver.findElement(By.xpath("//input[@id='Direccion :']")).sendKeys("Balcarce 1058");
        driver.findElement(By.id("Tipo de Carnet")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Moto')]")).click();
      //  driver.findElement(By.id("Renovación")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Crear')]")).click();
        
    }

    private static void login() {
        driver.findElement(By.id("email")).sendKeys("operador");
	    driver.findElement(By.id("password")).sendKeys("gaston01");
        driver.findElement(By.cssSelector("button.authBtn.mt-5.btn.btn-primary")).click();
    }


}