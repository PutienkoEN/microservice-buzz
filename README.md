# microservice-buzz

Project consists of:
1. Discovery service (in discovery package)
2. Gateway (in gateway package)
3. Two services - Catalog and Order.
4. Catalog service uses Discovery and Feing to communicate with Order service.
5. Catalog service have fallback in case order is not responding.
