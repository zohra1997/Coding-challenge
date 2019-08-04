---


---

<h1 id="trading-application">Trading Application</h1>
<h2 id="introduction">Introduction</h2>
<p>Trading app is an online stock trading simulation REST API which can be used to check stock market, create a user account, deposite and withdraw money, buy and sell stocks. The REST API can be utilized by front-end developers, mobile-app developers, and traders.<br>
It is a MicroService which is im-plememnted in Java with SpringBoot, PSQL database, IEX market Data and Http pooling connection manager.</p>
<h2 id="quick-start">Quick Start</h2>
<p>To utilize this REST API , CentOS 7, Docker and Java are required.</p>
<p><strong>Steps to start the API</strong></p>
<ol>
<li>
<p>Download the codes:<br>
<code>git clone https://github.com/zohra1997/Trading-App</code></p>
</li>
<li>
<p>Initialize The database:<br>
<code>systemctl status docker || systemctl start docker</code><br>
<code>export PSQL_PASSWORD="your password"</code><br>
<code>export PSQL_USER=" psql user"</code><br>
<code>export PSQL_HOST="psql host"</code><br>
<code># create docker voume to persist data</code><br>
<code>docker volume create pgdata</code><br>
<code>dcoker run --rm --name jrvs-psql -e POSTGRES_PASSWORD=$PSQL_PASSWORD -d -v pgdata:/var/lib/postgresql/data -p 5432:5432 $PSQL_USER</code><br>
<code># create the database and tables</code><br>
<code>psql -h $PSQL_HOST -U $PSQL_USER -f ./psql/sql_ddl/init_db.sql psql -h $PSQL_HOST -U $PSQL_USER -d jrvstrading -f ./psql/sql_ddl/schema.sql</code></p>
</li>
<li>
<p>Run spring boot app:<br>
<code>java -jar ./target/trading-1.0-SNAPSHOT.jar</code></p>
</li>
<li>
<p>To Access the API:<br>
Type the following in your browser or use postman to access the API .<br>
<code>https://http://localhost:8080/swagger-ui.html</code><br>
<img src="https://lh3.googleusercontent.com/9q0qfrwbb8ECy5RiUg_tb6eu147h1LN3bUH-pg3vF9CMe5kgW8jSa0BRhir_ZO7olpGrpv8XbmU" alt="enter image description here"></p>
</li>
</ol>
<p><img src="https://lh3.googleusercontent.com/mjJ61gB4YYrxAeK1Aa1j0Nm30pIJIlE9uN00VpEIdavntfIsEpQKAUfgqpPCU4ChEL3aL3i0shs" alt="" title="postman"></p>

