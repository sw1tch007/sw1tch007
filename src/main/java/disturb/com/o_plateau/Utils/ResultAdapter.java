package disturb.com.o_plateau.Utils;

import disturb.com.o_plateau.Models.Personne;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ResultAdapter {

        public static List<Personne> toListPersonne(ResultSet res) throws SQLException {
            List<Personne> personnes = new ArrayList<>();
            while (res.next()){
                Personne personne = new Personne();
                personne.setNom(res.getString(1));
                personne.setAge(res.getInt(2));
                personnes.add(personne);
            }
            return personnes;
        }
}
