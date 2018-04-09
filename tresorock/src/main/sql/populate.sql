INSERT INTO Client (idClient, Nom, Prenom, Ecole, Cotisant, Statut) VALUES
(1,'Sidonie', 'Frédéric', 'HEI', False, 'Normal'),
(2,'Juliette', 'Ginette', 'ISA', False, 'Normal'),
(3,'Léonide', 'Edith', 'HEI', True, 'Abonné'),
(4,'Eliane', 'Bastien', 'ISEN', False, 'Abonné');

INSERT INTO Participe (idParticipation, idClient, idSoiree, DateSoiree, Nom, Prenom, PrixPaye) VALUES
(1,1,1,'2018/01/10', 'Sidonie', 'Frédéric', 2.0),
(2,2,1,'2018/01/10', 'Juliette', 'Ginette', 1.5),
(3,3,1,'2018/01/10', 'Léonide', 'Edith', 20.0),
(4,4,1,'2018/01/10', 'Eliane', 'Bastien', 0.0),

(5,1,2,'2018/01/17', 'Sidonie', 'Frédéric', 2.0),
(6,3,2,'2018/01/17', 'Léonide', 'Edith', 0),
(7,2,2,'2018/01/17', 'Juliette', 'Ginette', 2.0),

(8,1,3,'2018/01/24', 'Sidonie', 'Frédéric', 2.0),

(9,1,4,'2018/01/31', 'Sidonie', 'Frédéric', 2.0),
(10,4,4,'2018/01/31', 'Eliane', 'Bastien', 0);

INSERT INTO Soiree (idSoiree,DateSoiree, RecetteDeCaisse, ErreurDeCaisse, Theme, Actif) VALUES
(1,'2018/01/10', 23.5, 0, '', False),
(2,'2018/01/17', 4.0, -0.5, '', False),
(3,'2018/01/24', 2.0, 0.25, 'Soiree Deguisement', False),
(4,'2018/01/31', 2.0, 0, '', False);






