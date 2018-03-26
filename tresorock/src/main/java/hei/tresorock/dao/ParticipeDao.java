package hei.tresorock.dao;

import hei.tresorock.entities.Participe;

import java.util.List;

public interface ParticipeDao {

        public List<Participe> listParticipe();

        public Participe getParticipe(Integer idParticipe);

        public Participe addParticipe (Participe participe);
}
