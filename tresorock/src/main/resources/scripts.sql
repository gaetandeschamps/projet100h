CREATE TABLE Client (Nom char(20), Prenom char(20), Ecole char(20),  Cotisant Boolean, Statut Char(20)); /*Constructeur Table ClientDao*/

INSERT INTO Client (Nom, Prenom, Ecole, Cotisant, Statut) VALUES
('Sidonie', 'Frédéric', 'HEI', False, 'Normal'),
('Julienne', 'Ginette', 'ISA', False, 'Normal'),
('Léonide', 'Edith', 'HEI', True, 'Abonné'),
('Eliane', 'Bastien', 'ISEN', False, 'Abonné');

CREATE TABLE Participe (DateSoiree date, Nom char(20), Prenom char(20), PrixPaye double); /*Constructeur Table Participe*/

INSERT INTO Participe (DateSoiree, Nom, Prenom, PrixPaye) VALUES
('2018/01/10', 'Sidonie', 'Frédéric', 2.0),
('2018/01/10', 'Juliette', 'Ginette', 1.5),
('2018/01/10', 'Léonide', 'Edith', 20.0),
('2018/01/10', 'Eliane', 'Bastien', 0.0),

('2018/01/17', 'Sidonie', 'Frédéric', 2.0),
('2018/01/17', 'Léonide', 'Edith', 0),
('2018/01/17', 'Juliette', 'Ginette', 2.0),

('2018/01/24', 'Sidonie', 'Frédéric', 2.0),

('2018/01/31', 'Sidonie', 'Frédéric', 2.0),
('2018/01/31', 'Eliane', 'Bastien', 0);

CREATE TABLE Soiree (DateSoiree date, RecetteDeCaisse double, ErreurDeCaisse double, Theme char(40)); /*Constructeur Table Soiree*/

INSERT INTO Soiree (DateSoiree, RecetteDeCaisse, ErreurDeCaisse, Theme) VALUES
('2018/01/10', 23.5, 0, ''),
('2018/01/17', 4.0, -0.5, ''),
('2018/01/24', 2.0, 0.25, 'Soiree Deguisement'),
('2018/01/31', 2.0, 0, '');






