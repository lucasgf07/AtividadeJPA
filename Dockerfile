FROM payara/server-full
COPY ./target/AtividadeJPA-1.0-SNAPSHOT.war $DEPLOY_DIR
