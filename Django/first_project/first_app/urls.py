from django.urls import path
from first_app import views

app_name = 'first_app'

urlpatterns = [
    path('', views.index, name="index"),
    path('home/', views.home, name="home"),
    path('educative/', views.educative, name="educative"),
]