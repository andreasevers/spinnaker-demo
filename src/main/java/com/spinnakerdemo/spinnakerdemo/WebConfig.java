@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {


   @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").setCachePeriod(0);
    }

}
