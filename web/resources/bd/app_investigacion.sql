-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-04-2016 a las 18:33:24
-- Versión del servidor: 5.6.27-log
-- Versión de PHP: 5.5.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `app_investigacion`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `investigador`
--

CREATE TABLE `investigador` (
  `id_investigador` int(11) NOT NULL,
  `in_nombres` varchar(45) NOT NULL,
  `in_apellido1` varchar(25) NOT NULL,
  `in_apellido2` varchar(25) NOT NULL,
  `in_tipo_identificacion` varchar(30) NOT NULL,
  `in_num_identificacion` int(20) UNSIGNED NOT NULL,
  `in_fecha_nac` date NOT NULL,
  `in_direccion` varchar(45) NOT NULL,
  `in_telefono` varchar(20) NOT NULL,
  `in_movil` varchar(20) DEFAULT NULL,
  `in_tipo_inves` varchar(25) NOT NULL,
  `in_estado` varchar(15) NOT NULL,
  `in_salario` decimal(10,0) NOT NULL,
  `in_contraseña` char(32) NOT NULL,
  `in_observacion` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `investigador`
--

INSERT INTO `investigador` (`id_investigador`, `in_nombres`, `in_apellido1`, `in_apellido2`, `in_tipo_identificacion`, `in_num_identificacion`, `in_fecha_nac`, `in_direccion`, `in_telefono`, `in_movil`, `in_tipo_inves`, `in_estado`, `in_salario`, `in_contraseña`, `in_observacion`) VALUES
(1, 'Camilo', 'Ceron', 'qwd', 'CC', 123, '2016-03-16', 'qwe', '12345', '', 'a', 'activo', '123425', 'qwer', ''),
(4, 'qds', 'asdf', 'asd', 'cc', 1234, '2016-02-16', 'df', '1234', '', 'fdsa', 'act', '12345', 'sdfg', '');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `investigador`
--
ALTER TABLE `investigador`
  ADD PRIMARY KEY (`id_investigador`),
  ADD UNIQUE KEY `in_num_identificacion_UNIQUE` (`in_num_identificacion`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `investigador`
--
ALTER TABLE `investigador`
  MODIFY `id_investigador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
