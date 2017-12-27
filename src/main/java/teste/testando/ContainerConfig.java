package teste.testando;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.stereotype.Component;

@Component
public class ContainerConfig implements EmbeddedServletContainerCustomizer {

	public void customize(ConfigurableEmbeddedServletContainer container) {
		container.setPort(9000);
	}

}
