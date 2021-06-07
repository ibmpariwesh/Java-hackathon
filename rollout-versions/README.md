# Rolling updates allow the following actions:

1. Promote an application from one environment to another (via container image updates)

2. Rollback to previous versions

3. Continuous Integration and Continuous Delivery of applications with zero downtime

## steps:

create first deployment
kubectl create ns helloworld
 kubectl create -f hello-dep.yml

create the svc

kubectl create -f hello-svc.yml

## verify 
 
 acessing the url in the browser

To see the Deployment rollout status, run 

3. kubectl rollout status deployment hello-deploy -n helloworld

To see the Deployment rollout history, run 

kubectl rollout history deployment hello-deploy -n helloworld

5. apply second deployment

kubectl apply -f hello-v1.1-dep.yaml

6. To check To see the Deployment rollout history, run 

 kubectl rollout history deployment hello-deploy -n helloworld

## verify 
 
 acessing the url in the browser you will see the update image


to rollout to previous version

7. kubectl rollout undo deployment hello-deploy --to-revision=1 -n helloworld


## verify 
 
 acessing the url in the browser you will see the previous image

