-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 04-Jun-2019 às 21:44
-- Versão do servidor: 10.1.19-MariaDB
-- PHP Version: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `loc`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `admin`
--

CREATE TABLE `admin` (
  `cod` int(3) NOT NULL,
  `nome` varchar(30) NOT NULL,
  `senha` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `admin`
--

INSERT INTO `admin` (`cod`, `nome`, `senha`) VALUES
(1, 'Admin', 'adm');

-- --------------------------------------------------------

--
-- Estrutura da tabela `ambientes`
--

CREATE TABLE `ambientes` (
  `cod` int(3) NOT NULL,
  `ambiente` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `ambientes`
--

INSERT INTO `ambientes` (`cod`, `ambiente`) VALUES
(4, 'Auditório'),
(5, 'Laboratório de Informática'),
(6, 'Quadra'),
(8, 'Laboratório de Química'),
(9, 'Laboratório de Biologia'),
(10, 'Laboratório de Física'),
(11, 'Mini-Auditório'),
(12, 'Anfiteatro');

-- --------------------------------------------------------

--
-- Estrutura da tabela `equipamentos`
--

CREATE TABLE `equipamentos` (
  `cod` int(3) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `marca` varchar(30) NOT NULL,
  `modelo` varchar(30) NOT NULL,
  `cor` varchar(15) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `equipamentos`
--

INSERT INTO `equipamentos` (`cod`, `nome`, `marca`, `modelo`, `cor`, `status`) VALUES
(32, 'Notebook', 'Dell', 'Inspiron 15', 'Preto', 'Indisponível'),
(33, 'Projetor Multimidia', 'Epson', 'W39 3500 Lumens Wxga', 'Branco', 'Disponível'),
(34, 'Mesa Digitalizadora', 'Wacom', 'CTL-472', 'Preto', 'Disponível'),
(35, 'Caixa de Som', 'JBL', 'Go 2', 'Preto', 'Disponível');

-- --------------------------------------------------------

--
-- Estrutura da tabela `professores`
--

CREATE TABLE `professores` (
  `cod` int(3) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `disciplina` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `professores`
--

INSERT INTO `professores` (`cod`, `nome`, `disciplina`) VALUES
(5, 'Geovane', 'Artes'),
(6, 'Álvaro', 'Biologia'),
(7, 'Natália', 'Química'),
(8, 'Valdirene', 'Língua Portuguesa'),
(9, 'Rafael', 'Língua Portuguesa');

-- --------------------------------------------------------

--
-- Estrutura da tabela `reservas`
--

CREATE TABLE `reservas` (
  `cod` int(11) NOT NULL,
  `equipamento` varchar(30) NOT NULL,
  `professor` varchar(30) NOT NULL,
  `ambiente` varchar(40) NOT NULL,
  `turma` varchar(40) NOT NULL,
  `dia` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `reservas`
--

INSERT INTO `reservas` (`cod`, `equipamento`, `professor`, `ambiente`, `turma`, `dia`) VALUES
(49, 'Notebook', 'Geovane', 'Auditório', 'Informática 1º Ano', '07/06');

-- --------------------------------------------------------

--
-- Estrutura da tabela `turmas`
--

CREATE TABLE `turmas` (
  `cod` int(3) NOT NULL,
  `turma` varchar(30) NOT NULL,
  `ano` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `turmas`
--

INSERT INTO `turmas` (`cod`, `turma`, `ano`) VALUES
(35, 'Informática', '1º Ano'),
(36, 'Hospedagem', '2º Ano'),
(37, 'Segurança do Trabalho', '1º Ano'),
(38, 'Libras', '3º Ano');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`cod`);

--
-- Indexes for table `ambientes`
--
ALTER TABLE `ambientes`
  ADD PRIMARY KEY (`cod`);

--
-- Indexes for table `equipamentos`
--
ALTER TABLE `equipamentos`
  ADD PRIMARY KEY (`cod`);

--
-- Indexes for table `professores`
--
ALTER TABLE `professores`
  ADD PRIMARY KEY (`cod`);

--
-- Indexes for table `reservas`
--
ALTER TABLE `reservas`
  ADD PRIMARY KEY (`cod`);

--
-- Indexes for table `turmas`
--
ALTER TABLE `turmas`
  ADD PRIMARY KEY (`cod`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `cod` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `ambientes`
--
ALTER TABLE `ambientes`
  MODIFY `cod` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
--
-- AUTO_INCREMENT for table `equipamentos`
--
ALTER TABLE `equipamentos`
  MODIFY `cod` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;
--
-- AUTO_INCREMENT for table `professores`
--
ALTER TABLE `professores`
  MODIFY `cod` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `reservas`
--
ALTER TABLE `reservas`
  MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=50;
--
-- AUTO_INCREMENT for table `turmas`
--
ALTER TABLE `turmas`
  MODIFY `cod` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
