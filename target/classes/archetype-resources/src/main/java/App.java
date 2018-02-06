package $package;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

@Component
public class App {
    @Activate
    public void activate() {
        System.out.println("Component Activated");
    }

    @Deactivate
    public void deactivate() {
        System.out.println("Component Deactivated");
    }
}
