import net.lenni0451.commons.httpclient.HttpClient;
import net.raphimc.minecraftauth.MinecraftAuth;
import net.raphimc.minecraftauth.step.java.session.StepFullJavaSession;
import net.raphimc.minecraftauth.step.msa.StepCredentialsMsaCode;
import org.junit.jupiter.api.Test;

public class MinecraftAuthTest {
    @Test
    public void test() throws Exception {
        HttpClient httpClient = MinecraftAuth.createHttpClient();
        StepFullJavaSession.FullJavaSession javaSession = MinecraftAuth.JAVA_CREDENTIALS_LOGIN.getFromInput(httpClient, new StepCredentialsMsaCode.MsaCredentials("2784530142@qq.com", "6nz9d4my"));
        System.out.println("Username: " + javaSession.getMcProfile().getName());
        System.out.println("Access token: " + javaSession.getMcProfile().getMcToken().getAccessToken());
        System.out.println("Player certificates: " + javaSession.getPlayerCertificates());
    }
}
