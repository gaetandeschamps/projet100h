/*Constructeur Table ClientDao*/
CREATE TABLE Client (
    idClient int(11) NOT NULL AUTO_INCREMENT,
    Nom char(20) NOT NULL,
    Prenom char(20) NOT NULL,
    Ecole char(20) NOT NULL,
    Cotisant Boolean,
    Statut Char(20) NOT NULL,
    PRIMARY KEY (idClient));

/*Constructeur Table Participe*/
CREATE TABLE Participe (
    idParticipation int(11) NOT NULL AUTO_INCREMENT,
    idClient int(11) NOT NULL,
    idSoiree int(11) NOT NULL,
    DateSoiree date NOT NULL,
    Nom char(20) NOT NULL,
    Prenom char(20) NOT NULL,
    PrixPaye double NOT NULL,
    PRIMARY KEY (`idClient`),
    CONSTRAINT fk_idClient
        FOREIGN KEY (idClient)             -- Colonne sur laquelle on crée la clé
        REFERENCES Client(idClient),
    CONSTRAINT fk_idSoiree
        FOREIGN KEY (idSoiree)
        REFERENCES Soiree(idSoiree));

/*Constructeur Table Soiree*/
CREATE TABLE Soiree (
    idSoiree int(11) NOT NULL AUTO_INCREMENT,
    DateSoiree date NOT NULL,
    RecetteDeCaisse double NOT NULL,
    ErreurDeCaisse double NOT NULL,
    Theme char(40) NOT NULL,
    PRIMARY KEY (idSoiree));






