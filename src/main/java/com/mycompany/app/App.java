package com.mycompany.app;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.mycompany.app") 
public class App {
    @Autowired
    private QueryService queryService;


   public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        
    // Retrieve the App bean from the Spring context and call run()
    App app = context.getBean(App.class);
    app.run();
    }

    public void run() {
        System.out.println("Hello World!");
        Pedido p = new Pedido();
        p.setProducto("Lolito Fernandez");
        System.out.println("This product " + p);
        Long id = queryService.setPedido(p);
        System.out.println(queryService.getPedido(id));
        
    }
}
