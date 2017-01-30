
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Feature/01Basic_Deal_Creation.feature"}
		,tags = {"@run"}
		,glue={"com.stepDefinition"}
		,monochrome = true
		,plugin = {"pretty", "html:DataSheet/target"}
		)
 
public class cukeRunnerTest {

}