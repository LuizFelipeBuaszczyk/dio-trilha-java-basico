# Resumo das Principais Ferramentas do Microsoft Azure
Este documento apresenta uma visão geral das categorias e ferramentas mais utilizadas no Microsoft Azure, a plataforma de computação em nuvem da Microsoft.

## 1. Fundamentos e Gerenciamento
- Azure Resource Manager (ARM): Modelo de gerenciamento para provisionar, monitorar e organizar recursos na nuvem. Permite a implantação de infraestrutura como código (IaC) através de templates.
- Azure Portal: Interface gráfica baseada em navegador para gerenciar todos os recursos do Azure.
- Azure CLI: Interface de linha de comando para gerenciar recursos do Azure de forma programática.
- Azure PowerShell: Módulo PowerShell para automatizar tarefas de gerenciamento e implantação no Azure.
- Azure Monitor: Serviço abrangente para coletar, analisar e atuar sobre dados de telemetria de ambientes do Azure e híbridos. Inclui logs, métricas, alertas e insights.
Azure Advisor: Fornece recomendações personalizadas para otimizar custos, segurança, confiabilidade, excelência operacional e desempenho dos recursos do Azure.
## 2. Compute (Computação)
- Azure Virtual Machines (VMs): Máquinas virtuais sob demanda que fornecem controle total sobre o sistema operacional.
- Azure App Service: Plataforma gerenciada para hospedar aplicações web, APIs REST e backends móveis. Suporta diversas linguagens e frameworks (Node.js, .NET, Java, Python, PHP, Ruby).
- Azure Functions: Serviço de computação sem servidor (serverless) que permite executar código sob demanda sem se preocupar com a infraestrutura subjacente. Ideal para microsserviços e processamento de eventos.
- Azure Kubernetes Service (AKS): Serviço gerenciado para orquestração de contêineres usando Kubernetes, simplificando a implantação, o gerenciamento e a escalabilidade de aplicações conteinerizadas.
- Azure Container Instances (ACI): A maneira mais rápida de executar um contêiner no Azure, sem necessidade de gerenciar VMs ou orquestradores.
- Azure Spring Apps: Serviço totalmente gerenciado para aplicações Spring Boot.
## 3. Storage (Armazenamento)
- Azure Blob Storage: Armazenamento de objetos massivamente escalável para dados não estruturados (textos, binários, imagens, vídeos, backups).
- Azure Files: Compartilhamentos de arquivos gerenciados na nuvem acessíveis via SMB e NFS.
- Azure Table Storage: Armazenamento de chave-valor NoSQL para dados estruturados.
- Azure Queue Storage: Fila de mensagens para armazenar grandes quantidades de mensagens.
- Azure Disk Storage: Armazenamento em disco persistente para máquinas virtuais.
## 4. Databases (Bancos de Dados)
- Azure SQL Database: Serviço de banco de dados relacional totalmente gerenciado, baseado no Microsoft SQL Server.
- Azure Database for MySQL/PostgreSQL/MariaDB: Serviços de banco de dados relacionais gerenciados para MySQL, PostgreSQL e MariaDB de código aberto.
-Azure Cosmos DB: Banco de dados NoSQL distribuído globalmente, com múltiplas APIs (SQL, MongoDB, Cassandra, Gremlin, Table) e baixa latência.
Azure Cache for Redis: Cache de dados na memória, de código aberto, para aplicações de alto desempenho e baixa latência.
## 5. Networking (Rede)
- Azure Virtual Network (VNet): Rede privada isolada na nuvem, onde você pode provisionar e gerenciar seus recursos.
- Azure Load Balancer: Distribui o tráfego de rede entre várias instâncias de recursos.
- Azure Application Gateway: Balanceador de carga de tráfego web na camada 7, com firewall de aplicação web (WAF) opcional.
- Azure VPN Gateway: Conecta redes locais a redes virtuais do Azure de forma segura.
- Azure ExpressRoute: Conexão privada e dedicada entre sua infraestrutura local e o Azure.
- Azure DNS: Serviço de hospedagem para domínios DNS.
- Azure Front Door: Ponto de entrada global e escalável que usa a rede global da Microsoft para criar aplicações web rápidas, seguras e massivamente escaláveis.
## 6. Security (Segurança)
- Azure Active Directory (AAD): Serviço de gerenciamento de identidade e acesso baseado em nuvem.
- Azure Security Center: Gerenciamento unificado de segurança e proteção avançada contra ameaças em ambientes de nuvem e híbridos.
- Azure Key Vault: Armazena e gerencia chaves criptográficas, senhas, certificados e outros segredos de forma segura.
- Azure Firewall: Serviço de segurança de rede gerenciado e baseado em nuvem que protege seus recursos de rede virtual.
- Azure DDoS Protection: Proteção contra ataques de negação de serviço distribuída (DDoS).
## 7. DevOps e Desenvolvedor
- Azure DevOps: Conjunto de serviços para planejar, desenvolver, testar e implantar aplicações. Inclui:
- Azure Boards: Ferramentas para planejamento e rastreamento de trabalho.
- Azure Repos: Repositórios Git privados e gratuitos.
- Azure Pipelines: CI/CD para automação de builds e releases.
- Azure Test Plans: Ferramentas para testes manuais e exploratórios.
- Azure Artifacts: Gerenciamento de pacotes (NuGet, npm, Maven, Python).
- Azure DevTest Labs: Ambientes para testes e desenvolvimento sob demanda, com gerenciamento de custos e políticas.
## 8. Analytics e IoT
- Azure Synapse Analytics: Serviço de análise unificado que reúne data warehousing corporativo e análise de Big Data.
- Azure Data Lake Storage Gen2: Solução de armazenamento altamente escalável e segura para workloads de Big Data analytics.
- Azure Stream Analytics: Mecanismo de processamento de eventos em tempo real para dados de streaming.
- Azure IoT Hub: Hub de mensagens bidirecional para conectar, monitorar e gerenciar milhões de dispositivos IoT.
- Azure Databricks: Plataforma de análise baseada no Apache Spark para ciência de dados e engenharia de dados.
## 9. AI/Machine Learning
- Azure Machine Learning: Plataforma completa para construir, treinar, implantar e gerenciar modelos de machine learning.
- Azure Cognitive Services: Coleção de APIs e SDKs que permitem adicionar recursos inteligentes de IA a aplicações, como visão computacional, fala, linguagem, tomada de decisão e pesquisa.