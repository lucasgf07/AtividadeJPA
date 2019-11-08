import br.edu.ifpb.dao.ArtigoDao;
import br.edu.ifpb.dao.ParticipanteDao;
import br.edu.ifpb.domain.Artigo;
import br.edu.ifpb.domain.Participante;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.junit.InSequence;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;
import java.util.Date;

@RunWith(Arquillian.class)
public class JpaTest {
    @Inject
    ArtigoDao artigoDao;

    @Deployment
    public static JavaArchive criarArquivoTeste() {
        return ShrinkWrap.create(JavaArchive.class)
                .addPackage(ArtigoDao.class.getPackage())
                .addPackage(Artigo.class.getPackage())
                .addAsResource("META-INF/persistence.xml");
    }

    @Test
    public void testeSalvarArtigo() {
        Artigo artigo = new Artigo("titulo teste","orientador teste",
                "coorientador teste","modalidade teste","url teste");
        artigoDao.salvar(artigo);

    }
}
