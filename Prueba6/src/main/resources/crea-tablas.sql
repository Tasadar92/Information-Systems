/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  danie
 * Created: 27-feb-2018
 */
CREATE TABLE `pelicula` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`anio` int(11) NOT NULL,
`imdb` varchar(255) DEFAULT NULL,
`titulo` varchar(255) DEFAULT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


insert into pelicula(anio,imdb,titulo) values ('1972','http://padrino1','El Padrino 1'),
('1972','http://padrino2','El Padrino 2'),
('1972','http://padrino3','El Padrino 3'),
('1972','http://padrino4','El Padrino 4'),
('1972','http://padrino5','El Padrino 5'),
('1972','http://padrino6','El Padrino 6'),
('1972','http://padrino7','El Padrino 7'),
('1972','http://padrino8','El Padrino 8'),
('1972','http://padrino9','El Padrino 9'),
('1972','http://padrino10','El Padrino 10');
